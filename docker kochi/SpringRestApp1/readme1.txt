docker build -t springrestapp1 .
docker run -p 7070:7070 -it springrestapp1  -- will run on 7070
docker run -p 8080:7070 -it springrestapp1  -- will run on 8080

http://localhost:8080/all
http://localhost:7070/all