package io.github.hogwartsschoolofmagic.factory

import org.springframework.boot.env.YamlPropertySourceLoader
import org.springframework.core.env.PropertySource
import org.springframework.core.io.support.EncodedResource
import org.springframework.core.io.support.PropertySourceFactory

/**
 * Фабрика для загрузки файлов конфигурации формата yml/yaml.
 */
internal class YamlPropertySourceFactory : PropertySourceFactory {
    override fun createPropertySource(
        name: String?,
        resource: EncodedResource,
    ): PropertySource<*> =
        resource.resource.let { innerRes ->
            YamlPropertySourceLoader().load(name ?: innerRes.description, innerRes).first()
        }
}
