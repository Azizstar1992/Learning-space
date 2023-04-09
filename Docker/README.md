# Docker commands 
This page details what i learned about docker

# what is docker?
docker is a service that allows you virtualize the application layer by containerizing applications, their libraries and dependancy.
docker has classically been used for linux exclusively however to use docker on windows and mac, part of the OS had to virtualized.
the part that is virtualized is the OS kernel.Docker is an alternative to Virtual machines in that its light weight and boots up faster with a smaller file size.

# Docker engine 
#how to check information about docker version
- docker version

## Docker pull section
how to download a docker image
- docker pull {image}:{version}

# Docker run commands 
#how to run a docker container
- step 1: pull image 
- step 2: then docker run {image}:{version} / alternatively run it directly

how to run a docker container in detached mode
- step 1: download image
- step 2: docker run -d {image}:{version}

how to run commands on running containers like Ubuntu
- step 1: docker exec {container name} {your linux command here}

how to make docker interactive 
- docker run -i

how to run an app in a pseudoterminal
- docker run -it
# Docker images
how to list your docker images that are downloaded
- step 1: docker images

# Docker containers 
how to list all the docker containers
- step 1: docker ps

how to name a docker container
- docker run --name {name here} {image}


