# SeriesStream
##Build
```$xslt
mvn clean package
```
##Run
```$xslt
java -jar target/series-stream-0.0.1-SNAPSHOT.jar
```
##Docker
###Build docker
```$xslt
docker build -t seriesstream .
```
###Run the app
```$xslt
docker run -p 8080:8080 seriesstream
```
###Stop the app
```$xslt
docker container ls #find docker id
docker stop #id
```
