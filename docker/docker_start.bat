call env.bat

docker stop %APPLICATION_NAME%-postgres
docker rm %APPLICATION_NAME%-postgres

docker stop %APPLICATION_NAME%-bot
docker rm %APPLICATION_NAME%-bot

docker-compose up --build -d