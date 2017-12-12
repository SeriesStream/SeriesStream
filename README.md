# SeriesStream
## Build
```
mvn clean package
```
## Run
```
java -jar target/series-stream-0.0.7-SNAPSHOT.jar
```
## Docker
### Build docker
```
docker build -t seriesstream .
```
### Run the docker app
```
docker run -p 8080:8080 seriesstream
```
### Stop the docker app
```
docker container ls #find docker id
docker stop #id
```
### Docker MYSQL database
* Install
```
docker pull mysql:5.7
docker run -p 3306:3306 --name stream-mysql -e MYSQL_ROOT_PASSWORD=pass -d mysql:5.7
#-v /my/own/datadir:/var/lib/mysql #space in docker ro save data
```
* Run 
```
docker ps -a #find mysql docker id
docker start #id
```
* Or run all existing 
```
docker start $(docker ps -a -q)
```
* Connect docker mysql with SeriesStream
```
docker run --detach --name ss-mysql --link stream-mysql:mysql wordpress
```