# Docker commands 
This page details Docker commands

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

# Docker images
how to list your docker images that are downloaded
- step 1: docker images

# Docker containers 
how to list all the docker containers
- step 1: docker ps

how to name a docker container
- docker run --name {name here} {image}
