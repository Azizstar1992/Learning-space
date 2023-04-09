# Docker commands 
- This page details Docker commands

#how to download a docker image
- docker pull {image}:{version}

#how to run a docker container
- step 1: download image
- step 2: docker run {image}:{version}


#how to see all the images that you have downloaded
- step 1: docker images
- ![image](https://user-images.githubusercontent.com/126476257/230448748-326c288e-b658-4fb9-978b-a99410251d07.png)

#how to list all the docker containers
- step 1: docker ps

#how to run a docker container in detached mode
- step 1: download image
- step 2: docker run -d {image}:{version}

#how to run commands on running containers like Ubuntu
- step 1: docker exec {container name} {your linux command here}

#how to check information about docker version
- docker version

#how to name a docker container
- docker run --name {name here} {image}
