docker build -t springapp2 .

docker run -p 8080:7070 -it springapp2  -- expose is 8080 -- it will run on 7080


docker run -p container:host -it 