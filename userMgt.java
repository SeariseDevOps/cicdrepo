git 
yinka
ope
ayomide
bunme
Glory and Ope is here learning git for the first time
Glory is a DevOps Engineer
Ope is a DevOps Engineer
Prof Yinka is also learning git
We are a qualify DevOps Engineers
Manager is making changes here 
Have you used helm?
Have you used eks?
What do you use for CICD?
How do you manage and scale infrastructure using eks
Have you used Ansible
What is your Experience with application monitoring tools like DataDog and NewRelic
how do you build and maintain CI/CD pipelines.
Are you willing to learn PHP
We are migrating from ECS to EKS.
We use AWS CodePipeline
We use git to store our artifacts.

What would I do if I am working on two files but want the outputs in one file.
I have two legacy applications that I want to deploy to K8s. How would you set up the infrastructure?
I am searching for a particular application.  How do I find them in Linux?
How do you deploy into different environments using a pipeline?
How do you setup with security in mind?
How would work with another devops engineer who wants to learn and play with the environment you set up?
Tell me about a time when the project you worked on failed.  
how would you design your environment for the very first version of your application.  

What automation tools have you used?
step by step, Walk me through creating your Jenkins cluster.
Walk me through your EKS pipeline in Jenkins.
===================================================
THIS FROM LOCAL REPO
==================================
7 years Experience in IT and DevOps:
How applications were deployed:
  1990S --- 10 years
  2000S
  TODAY
 1) Traditional/Physical Deployment
 2) Virtualized Deployment (Hardware level Isolation)
 3) Containerized Deployment(OS/Process level Isolation)


====================================
Docker -- Is a containerization software use to create, build and
          deploy our applications as containers
          Build applications
          ship applications
          deploy applications

How many environment are you supporting in your role??
         Development environment
         Testing/QA environment
         Production environment

Container --> contains everything (App Files (code), Dependencies
(Softwares +Libraries), ENV vars & Other Configuration files)
which is required for a piece of application/process.
          app.war   -----> Virtual Machine
                           java and Tomcat installed and configured

    app code  = app.war  +
    Dependencies = openjdk11+ + tomcat9

Containerization Software/Runtime --> :
  Docker,
  Rocket,
  Pod man,
  CRI-O,
  Core-OS,
  Container-D.

Docker:
  Is a containerization multi-platform software use to
  create, build, ship, share and deploy containerize applications

O.S --> Cross Platform (Docker can be installed in any O.S)
        Docker Can Be Installed on Linux, Windows OS, macOS
        Desktops as well as servers.

Docker is available in 2 Editions:

 1) Docker CE: --> Community Edition (Free to use)
 2) Docker EE: --> Enterprise Edition (Commercial/Licensed)
     CE+
     ---
      1) Vendor Support = docker.io
      2) Additional Features like DTR (Docker Trusted Registry),
      3) UCP (Universal Control Plane) GUI.

Docker is developed in Go Lang/Go Language.

Docker Desktop (Local Laptops/Desktops) -->
https://docs.docker.com/engine/install/#desktop
  Developers/DevOps Engineers Systems

Linux Flavors :
 CentOS
 Amazon Linux
 Red Hat
 Ubuntu
 Debian
 Fedora
 SUSE Linux …etc.

Officially, Docker CE is not supported for Red Hat.

app1:
    appCode      = app.war  +
    Dependencies = openjdk11+ + tomcat9

app1:
    appCode      = app.ear  +
    Dependencies = openjdk11 + JBoss/WildFly

app3: python app
    appCode      = app  +
    Dependencies = python

app3: nodeJS app
    appCode      = app  +
    Dependencies = npm

           Wife  Husband/Children
10 days

  1.  go and buy food and prepare

          Husband     Children    Visitors

  2.
app1:
    appCode      = app.war  +
    Dependencies = openjdk11+ + tomcat9

Dockerfile:
FROM  tomcat:8.0.20-jre8                     = base image
COPY  target/tesla.war /opt/tomcat9/webapps/

docker build
docker push
Create, build,

Install Docker on  Ubuntu
###########################
sudo apt update -y
sudo apt install docker.io -y
sudo service docker start
sudo docker info
sudo hostnamectl set-hostname docker
sudo su - ubuntu

You will get permission denied error as regular user
doesn't have permissions to execute docker commands.
Add user to docker group.

sudo usermod -aG docker $USER
     or
sudo usermod -aG docker ubuntu
sudo su - ubuntu

# Exit From Current SSH Terminal & SSH(Login) again . Then execute
docker ps

# Amazon Linux
###########################
sudo yum update -y
sudo yum install docker -y
sudo service docker start

Add Regular user to docker group
sudo usermod -aG docker  <username>

ex:
sudo usermod -aG docker ec2-user
================================
Dockerfile: --> Dockerfile is a file which contains instructions
                needed to create an image.
   Dockerfile contains Specific Keywords use to build images by
   the Docker Domaen

https://github.com/LandmakTechnology/maven-web-application
  ubuntu@docker:~/web$ cat Dockerfile
Dockerfile1:
FROM tomcat:8.0.20-jre8
COPY target/*.war /usr/local/tomcat/webapps/maven-web-app.war


Docker Image: --> It's a package which contains
                 everything (Libraries, Softwares+ENV+Application Code)
                 to run your application.

Docker containers: Run time instance of a docker image.
     If you execute: docker run,
     a container is created from the image

ubuntu@docker:~/web$ sudo apt install maven -y
    sudo apt install maven -y
    sudo yum install maven -y

http://54.156.124.67:8080/tesla/

http://54.156.124.67:8000/tesla/


Docker images :
Docker containers
Dockerfile
Docker Networks
Docker volumes
Docker compose
Docker swarm

 AMIs                ubuntu   Redhat  CentOS  windows   macOS
AMIs = \  os+git   os+      os+    os+       os+
aws
======================
Docker client         = CLI[docker]
Docker Daemon/Service =
Docker Registry  = docker hub
                   dockerhub.com
                   https://hub.docker.com/signup

docker push mylandmarktech/landmark-web-app:tagname   :
   dockerhub username: mylandmarktech
   registry name     : landmark-web-app
   tagname: latest, 1, 2, 3, mlt-v4

docker push mylandmarktech/landmark-web-app
FROM tomcat:8.0.20-jre8
#### Good stuff
COPY target/tesla.war /usr/local/tomcat/webapps/tesla.war

Amazon Elastic Container Registry - ECR:
========================
docker image commands:
  docker build ---
   docker build -t imageName:tagname -f DockerfileName /home/ubuntu/
   docker build -t imageName:tagname -f DockerfileName path-to-df
     -t = tagname
     -f = DockerfileName
DockerfileName:
  1. Dockerfile_webapp,
      docker build -t webapp:1 -f Dockerfile_webapp /home/ubuntu/web/
      docker build -t webapp:1 -f Dockerfile_webapp .
      docker build -t webapp:1 -f Dockerfile_webapp ~
      docker build -t webapp:1 -f Dockerfile_webapp /home/ubuntu/
  2. Dockerfile

  3. $DockerfileName

docker images  = List all docker images
docker image ls
docker image --help
ubuntu@docker:~/web$ docker image --help

Usage:  docker image COMMAND

Manage images

Commands:
  build       Build an image from a Dockerfile
  history     Show the history of an image
  import      Import the contents from a tarball to create a filesystem image
  inspect     Display detailed information on one or more images
  load        Load an image from a tar archive or STDIN
  ls          List images
  prune       Remove unused images
  pull        Pull an image or a repository from a registry
  push        Push an image or a repository to a registry
  rm          Remove one or more images
  save        Save one or more images to a tar archive (streamed to STDOUT by default)
  tag         Create a tag TARGET_IMAGE that refers to SOURCE_IMAGE

Run 'docker image COMMAND --help' for more information on a command.
ubuntu@docker:~/web$

docker push mylandmarktech/landmark-web-app:1
docker pull mylandmarktech/landmark-web-app

docker tag:  = tag the image with repository details
docker tag landmark:2 mylandmarktech/landmark-web-app:1


docker login:  we need authentication to push images to both
               public and private repository/registry

docker login -u mylandmarktech -p mypassword

docker push:   push images to registry [dockerhub/ecr/nexus]
docker push mylandmarktech/landmark-web-app:1
docker pull mylandmarktech/landmark-web-app:1
---
docker rmi -f imageName:tag/image-ID
docker rmi image-ID
docker rmi -f imageName:tag/image-ID

push to aws ecr:
aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin 287784533479.dkr.ecr.us-east-1.amazonaws.com

docker tag landmark-web-app:latest 287784533479.dkr.ecr.us-east-1.amazonaws.com/landmark-web-app:latest

docker tag mylandmarktech/landmark-web-app:1 287784533479.dkr.ecr.us-east-1.amazonaws.com/landmark-web-app:1

docker push 287784533479.dkr.ecr.us-east-1.amazonaws.com/landmark-web-app:1

docker push 287784533479.dkr.ecr.us-east-1.amazonaws.com/landmark-web-app:latest

Nexus private docker registry:
==============================
    htttps://8.200.55.9:8081/tesla/landmark-web-app
 docker tag landmark:2 8.200.55.9:8081/tesla/landmark-web-app:1
 docker push 8.200.55.9:8081/tesla/landmark-web-app:1

Docker images commands:
  docker build   = create images from a Dockerfile
  docker tag     = assigns repository name to images
  docker images    = list images
  docker image ls  = list images
  docker images -q = list image ids

  docker rmi imageID/name:tag     = delete an image
  docker rmi -f imageID/name:tag  = force delete an image

  docker rmi -f a848f84f4894
  docker rmi -f  $(docker images -q) = deletes all images
  docker run image2
  docker pull nginx
  docker pull alpine
  docker images prune

ubuntu@docker:~/web$ docker rmi $( docker images -q )  :
  docker run --name myapp -d -p 80:8080 mylandmarktech/landmark-web-app:1
  curl -v localhost/tesla
  curl -v  54.156.124.67:80/tesla
  curl -v  54.156.124.67/tesla

=======================================
docker container commands  :
=========================
containers are created from docker images
  a container is a running process/instance of a docker image

  docker pull   = pull the docker image from the registry
  docker create = use the image to create a container   -
  docker start  = start the container
  docker stop   =  stop container
  docker run = docker create + docker start
docker run --help
docker container --help

   docker run jenkins/jenkins

   "jenkins/jenkins

   docker pull jenkins/jenkins

  docker run --name jenkins -d -p 7000:8080 jenkins/jenkins

docker run --name jenkins -d -p 7000:8080 jenkins/jenkins
    curl -v 3.91.80.19:7000
docker run --name nginx -d -p 9000:80 nginx
docker run --name tomcat -d -p 5000:8080 tomcat
docker run --name appName -d -p hostPort:containerPort image:tagname

 3.91.80.19

Jenkins:
  /var/jenkins_home/secrets/initialAdminPassword

docker exec containerName or containerID command
docker exec jenkins cat /var/jenkins_home/secrets/initialAdminPassword

  docker ps -          = list running containers
  docker container ls  = list running containers
  docker ps -q = list running containers IDs
  docker ps -a  = list running & stopped/excited containers
  docker ps -aq = list running & stopped/excited containers IDs

Avoid address/port binding:
===========================
35 Lane Street     35  35   35
netstat -tulpn


Deploy sonarQube using:
=====================
docker pull sonarqube
docker run --name sonar -d -p 4000:9000 sonarqube
http://3.91.80.19:7000/
http://3.91.80.19:4000/

Docker and Kubernetes:

ubuntu@docker:~$ docker start myapp
Error response from daemon: No such container: myapp
Error: failed to start containers: myapp
====================
docker run --name webapp -d -p 80:80 mylandmarktech/hello

  docker ps -          = list running containers
  docker container ls  = list running containers
  docker ps -q = list running containers IDs
  docker ps -a  = list running & stopped/excited containers
  docker ps -aq = list running & stopped/excited containers IDs

List ONLY stopped Containers
=================================
docker ps -aq --filter  status="exited"
docker ps -a --filter  status="exited"

List Running Containers
=======================
docker ps -a --filter  status="running"
docker ps
docker container ls

List All Containers
==================
docker ps -a
docker container ls -a

List only running container ids
==============================
docker ps -q
docker container ls -q


List all container ids
==============================
docker ps -aq
docker container ls -aq

Delete excited/stopped Containers
================================
  docker rm $(docker ps -aq --filter  status="exited")

---
Delete excited/stopped Containers
================================
  docker rm $(docker ps -aq --filter  status="running")
  docker rm containerId/Name
=====================

Start the container
===================
docker start <containerId/Name>
docker start myapp

stop/kill the container
========================
  docker stop <containerId/Name>
    gives warning before stopping the container process
  docker kill <containerId/Name>
    gives no warning before stopping the container process

pause/unpause
============
    docker pause <containerId/Name>
    docker unpause <containerId/Name>

docker run --name webapp -d -p 80:80 mylandmarktech/hello    :
docker pull mylandmarktech/spring-boot-mongo
docker run --name javaapp -d -p 7000:8080 mylandmarktech/java-web-app
ocker run --name app -d -p 8000:8080 mylandmarktech/myapp

docker run --name myapp -d -p 8080:8080 mylandmarktech/spring-boot-mongo

docker run --name myapp -d -p 8080:7000 mylandmarktech/spring-boot-mongo

How to resolves issues occuring in a docker container??
How to troubleshoot or debug applications running as docker containers? :
1. docker ps -a =
    = will check if the container is
      running, paused or exited
   docker start/unpause
2. docker top  = check resources
3. docker stats containerNAME/ID
4. docker logs containerNAME/ID
5. docker exec  = run commands inside the container
   docker exec app ls
   docker exec -it app   /bin/bash
7. docker inspect containerNAME/ID
8. docker attach containerNAME/ID
9.  netstat -tulpn

docker cp  = use to copy files into the container from the dockerhost
             and vise versa

docker cp foo.txt container_id:/foo.txt

docker cp web app:/web
docker exec app pwd
docker cp dc.sh app:/usr/local/tomcat/
docker cp app:/usr/local/tomcat/logs /home/ubuntu
docker cp app:/usr/local/tomcat/logs .
docker cp app:/usr/local/tomcat/logs ~

docker cp
Container to the system
docker cp <containerName>:</pathOftheContainerFile>  <SystemPath>/<fileName>
docker cp javawebappone:/usr/local/tomcat/logs/catalina.2020-04-23.log  javawebappone.log
system to the Container

docker cp  <SystemPath>/<fileName><containerName>:</pathOftheContainerFile>

docker cp  /home/ubunut/test.log javawebappone:/usr/local/tomcat/logs/test.log

docker rename <ContainerId/NameOld> <NewName>

What is difference b/w docker cp & COPY?

What is docker commit?
Using docker commit we can create image from the continer.

docker commit <containerId/Name> <imageName>
docker commit app image3:1

Can we set CPU,RAM limit for the containers while creating?
Yes We set using options while creating a container.
docker run -d --name app -p 8000:8080 mylandmarktech/maven-web-app
docker diff contianerName/ID

docker commit app image2

docker container commands:
  docker run/create/start/stop/kill/inspect/logs/top/stats/
  docker diff/update/cp/commit/paus/unpause/ps/ps-a/exec
  docker rm/rm-f/ps -q/

docker images commands:
  docker build/login/push/pull/tag/images/images prune/
  docker rmi/rmi-f/system prune

docker images --help
docker containers --help

Dockerfiles:
============
Dockerfiles are input use to build docker images
Docker images are input needed/used to create containerised applications

1#
FROM tomcat:8.0.20-jre8
COPY target/*war /usr/local/tomcat/webapps/tesla.war
2#
FROM tomcat:8.0.20-jre8
COPY target/app.ear /usr/local/tomcat/webapps/app.war
3#
FROM jboss/wildfly:latest
ADD target/*war /opt/jboss/wildfly/standalone/deployments/

            "ExposedPorts": {
                "8080/tcp": {}

DockerImage: --> It's package which contains application code
        + all it's dependencies(Software+ENV Varibles + Config Files)
        together.
java-based projects:

  curl -v localhost:6000/landmark
  curl -v 44.211.75.85:6000/landmark

Dockerfile keywords:
===================
FROM
MAINTAINER
COPY
ADD
RUN
CMD
ENTRYPOINT
WORKDIR
ENV
EXPOSE
USER
VOLUME
LABEL
ARG

Base image generally contains Libraries and dependencies  :
    java-standalone applications
FROM  openjdk11
   java-web applications
FROM  tomcat:9.0.7-openjdk11
FROM  jboss/wildfly

  docker pull tomcat:9.0.71-jdk17-corretto-al2

FROM --> FROM indicates the  base image(Layers) such as OS(Libraries)
 like centos,alpine,ubuntu or any programatic language(java,python,node,go)
 or some other sofwares like tomcat,nginx,mysql..etc. Using base image
 we can create our own image. All sub subsequent instructions(Layers)
 will be executed/created on top of base image
layers.


Syntax:
FROM  <ImageName>
Ex:
FROM tomcat:8.0.20-jre8
FROM openjdk:8-alpine
FROM nginx
FROM node
FROM python

MAINTAINER --> It's will be used as comments to describe
author/owner who is maintaning the docker file.
This instruction allows you to set the Author/Owner of the Image.

MAINTAINER <name>
MAINTAINER <LandmakTechnology mylandmarktech@gmail.com>
MAINTAINER <Docker Community>

COPY  --> Using COPY we can copy files/folders to the image.
Files/Folders will be copied to the image while building an image.
Using COPY instruction we can COPY local(build context) files or directories(folders) to the image while building image.

COPY target/tesla.war /usr/local/tomcat/
COPY . .

SYTNAX:
======
COPY <source>                <destination>
      ServerFile/FolderPath   PathInsideImage

ADD -->
     ADD also can copy files to the image while creating image.
     ADD can copy local files from host server(build context)
     and also  can download files from remote HTTP/S locations
     while creating a image.

     https://8.25.3.9:8081/repo/tesla/tesla.war

ADD https://8.25.3.9:8081/repo/tesla/tesla.war /usr/local/tomcat/

FROM ubuntu
ADD https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.71/bin/apache-tomcat-9.0.71.tar.gz /opt/


RUN, CMD, ENTRYPOINT:  instructions can be used to execute commands/scripts.
These RUN,CMD,ENTRYPOINT can be defined in 2 forms.

1) -#Shell Form

RUN <command> <arg1> <arg2>
     mkdir /opt/class
CMD <command> <arg1> <arg2>
      catalina.sh  start
ENTRYPOINT <commond> <arg1> <arg2>
      /bin/bash -c catalina.sh  start
     /bin/bash -c catalina run

2) -#Executable Form

RUN ["command/executable" , "arg1","arg2"]
    ["mkdir" , "/opt/class30"]

CMD ["commond/executable" , "arg1","arg2"]
    ["catalina" , "run"]

ENTRYPOINT ["commond/executable" , "arg1","arg2"]
           ["catalina" , "run"]

RUN --> RUN instruction will  execute commands/scripts.
        RUN commands or instructions will be executed while creating an image on top
        of the previous layers(Image).
        Next to run you can mention any command based on base os of image.
        We can have number of RUN instructions in a docker file
        all the RUN instructions will be exectued one after the other from top to bottom.

  Dockerfile_RUN:
  FROM tomcat:9.0.71-jdk8-corretto-al2
  ADD target/tesla.war  /usr/local/tomcat/
  CMD sh catalina.sh run
  CMD ["catalina", "run"]

Dockerfile_CMD:
FROM ubuntu
RUN mkdir /opt/class30
RUN touch /opt/class30/jobs
ADD . /opt/class30
CMD pwd
CMD ["echo", "I am rich"]

docker build -t image2 -f Dockerfile_CMD .



What is difference b/w RUN & CMD?

RUN instructions will be executed while creating a image.
CMD Instructions will be executed while creating a container.
We can have more than one RUN keyword in a docker file.
All the RUN keywords will be processed while creating an image in the defined order(top to bottom).

Can we have more than one CMD in dockerfile?
Yes you can have. But only the last one/recent one in the order will be proccessed
while creating a container.



ENTRYPOINT --> ENTRYPOINT configures a container that will run as an executable.
           ENTRYPOINT is a command or script that is executed when you run the docker container.


Dockerfile_EP:
FROM ubuntu
RUN mkdir /opt/class30
RUN touch /opt/class30/jobs
ADD . /opt/class30
ENTRYPOINT ["echo", "I am rich from ENTRYPOINT"]

How is ENTRYPOINT different from CMD?
1. Both are command instructions executed while creating a container
2. ENTRYPOINT can't be over riden while we can over ride CMD

ENV --> ENV instruction sets the environment variable and this sets the environment for the subsequent build instructions. It takes two forms: one with a single variableENV <key> <value> and another with multiple variables ENV <key> =<avlue> <key> = <value>.



ARG -> ARG Instruction defines a variable that can be passed at build time. Once it is defined in the Dockerfile you can pass with this flag --build-arg while building the image. We can have multiple ARG instruction in the Dockerfile. ARG is the only instruction that can precede the FROM instruction in the Dockerfile.

ARG values are not available after the image is built. A running container won’t have access to an ARG variable value


EX:

ARG TAG=latest
FROM centos:$TAG
docker build -t <image-name>:<tag> --build-arg TAG=centos8 .


WORKDIR --> WORKDIR  is used to define the working directory of a Docker container at any given time. The command is specified in the Dockerfile.It is optional (default is / , but base image might have set it), but considered a good practice. Subsequent instructions in the Dockerfile, such as RUN , CMD and ENTRYPOINT will operate in this dir.

Ex:

WORKDIR /app


LABEL

The LABEL instruction adds metadata to an image. A LABEL is a key-value pair. To include spaces within a LABEL value, use quotes and backslashes as you would in command-line parsing. A few usage examples:


LABEL branch=develop

LABEL description="This text illustrates"


An image can have more than one label. You can specify multiple labels on a single line.

LABEL label1="value1" label2="value2" other="value3"



USER

The USER instruction sets the user name (or UID) and optionally the user group (or GID) to use when running the image and for any RUN, CMD and ENTRYPOINT instructions that follow it in the Dockerfile




EXPOSE

The EXPOSE instruction informs Docker that the container listens on the specified network ports at runtime.

The EXPOSE instruction does not actually publish the port. It functions as a type of documentation between the person who builds the image and the person who runs the container, about which ports are intended to be published. To actually publish the port when running the container, use the -p flag on docker run to publish and map one or more ports.

EXPOSE 8080




Dockerfile Best practices:
==========================
1. We should use executable over shell form for CMDs and ENTRYPOINTs instructions
2. Reduce the number of RUN instructions as much as possible.
   This will reduce the number Layers and keep our images light weight.
3. Use Official/Trusted docker base images in your Dockerfile
    FROM ubuntu/tomcat
4. Use light weight alpine linux where ever possible
   https://hub.docker.com/_/alpine
   ubuntu/centos/alpine
5. scan images before usage
     docker scan imageID/Name

6) Don't install/have unnecassary packages(Softwares) & Don't
   copy unnecassary files & Folders .

7) Don't run container process as root user. Start container
   process(Application) as non root user.

8) Try to Scan images for fulnerabilites(Clair ,Anchor or Trivy or Inbuilt Scaning in ECR/GCR/ACR).

9) Try to use multi Stage Docker files to reduce size of the image where ever it's applicable
https://github.com/LandmakTechnology/Dockerfiles

10. Keywords should be in uppercase to distinguish it from arguments

multi Stage Docker files:
1. Clone
2. Build
3. DeployAsContainer

FROM ubuntu:git
WORDIR /home/ubuntu/
RUN clone https://git/repo/webapps \
    && cd  webapps
    && mvn install
FROM tomcat:71-jdk8-corretto-al2


#git
FROM alpine/git as repo
MAINTAINER mylandmarktech@gmail.com
WORKDIR /app
RUN git clone https://github.com/LandmakTechnology/maven-web-application

#Maven
FROM maven:3.5-jdk-8-alpine as build
WORKDIR /app
COPY --from=repo /app/maven-web-application  /app
RUN mvn install

#Tomcat
FROM tomcat:8.0.20-jre8
#COPY  /app/target/*war /usr/local/tomcat/webapps/maven-web-app.war
COPY --from=build /app/target/*war /usr/local/tomcat/webapps/

ubuntu@docker:~/web/laps$ docker system prune
WARNING! This will remove:
  - all stopped containers
  - all networks not used by at least one container
  - all dangling images
  - all dangling build cache



FROM ubuntu:latest
RUN apt-get -y update && apt-get -y upgrade \
RUN apt-get -y install openjdk-8-jdk wget
RUN mkdir /usr/local/tomcat
RUN wget http://apachemirror.wuchna.com/tomcat/tomcat-8/v8.5.46/bin/apache-tomcat-8.5.46.tar.gz -O /tmp/tomcat.tar.gz
RUN cd /tmp && tar xvfz tomcat.tar.gz \
    && cp -Rv /tmp/apache-tomcat-8.5.46/* /usr/local/tomcat/
EXPOSE 8080
CMD /usr/local/tomcat/bin/catalina.sh run

FROM ubuntu:latest
RUN apt-get -y update && apt-get -y upgrade \
    && apt-get -y install openjdk-8-jdk wget \
    &&  mkdir /usr/local/tomcat \
    && wget http://apachemirror.wuchna.com/tomcat/tomcat-8/v8.5.46/bin/apache-tomcat-8.5.46.tar.gz -O /tmp/tomcat.tar.gz
    && cd /tmp && tar xvfz tomcat.tar.gz \
    && cp -Rv /tmp/apache-tomcat-8.5.46/* /usr/local/tomcat/
EXPOSE 8080
CMD /usr/local/tomcat/bin/catalina.sh run

Dockerfile keywords/instructions:
=================================
FROM
COPY
ADD
RUN
CMD
ENTRYPOINT
WORKDIR ENV
LABEL
ARG
USER
EXPOSE
VOLUME
MAINTAINER

Micro-services and
Docker networks
volumes and
Docker compose
docker swarm

http://44.211.75.85:3000/landmarktechnologies

curl -v 44.211.75.85:3000/html

docker run -d -p 30000:9981  mylandmarktech/nodejs-fe-app


FROM amazoncorretto:8-al2-jdk

ENV CATALINA_HOME /usr/local/tomcat
ENV PATH $CATALINA_HOME/bin:$PATH
RUN mkdir -p "$CATALINA_HOME"
WORKDIR $CATALINA_HOME

ARG
FROM

ARG TAG=latest
FROM centos:$TAG

docker build -t <image-name>:<tag> --build-arg TAG=centos8 .

  ebay:


Docker networks:
================
What is a network ?
Group of servers/devices connected to each other in a specific network. If Servers
are in same network each one can talk to another server.

Docker network
=============
If One Container has to talk to another Container Using ContainerIP/Name(DNS) in Docker.
Both has to created under same docker network.

If Containers are in two different networks. They can't access each other.

How to list networks in docker?

docker network ls

Default bridge
custom bridge
host
none
ubuntu@docker:~$ docker network ls
NETWORK ID     NAME      DRIVER    SCOPE
7b51ede636f3   bridge    bridge    local
a00011a24f3f   host      host      local
4a1dde3cd8e5   none      null      local
ubuntu@docker:~$
ubuntu@docker:~$
ubuntu@docker:~$ docker network create tesla
ffc0324f2f3e7340f8b16e8027391d702ccbe0b71620f6da250b7e23e8bbc91f
ubuntu@docker:~$
ubuntu@docker:~$ docker network create -d bridge ebay
f5f83ee43ba1171458d2a823e0df57b2577ebbb2cd05e13dc9030c749ab69472
ubuntu@docker:~$
ubuntu@docker:~$ docker network ls
NETWORK ID     NAME      DRIVER    SCOPE
7b51ede636f3   bridge    bridge    local
f5f83ee43ba1   ebay      bridge    local
a00011a24f3f   host      host      local
4a1dde3cd8e5   none      null      local
ffc0324f2f3e   tesla     bridge    local
ubuntu@docker:~$

We support Java based applications:
===================================
We support nodeJS and .net based applications:
==============================================
spring:
  data:
    mongodb:
      host: ${MONGO_DB_HOSTNAME}  myhost
      port: 27017
      username: ${MONGO_DB_USERNAME}  mydb
    password: ${MONGO_DB_PASSWORD}
      database: users
      authentication-database: admin
server:
  port: 8080

docker pull mylandmarktech/spring-boot-mongo
docker pull mongo
We are developing and depoloying:
    stateless applications
Our applications is developed to write data in a database
statefulll applications

docker run --name springapp -d -p 4000:8080 --network tesla -e MONGO_DB_USERNAME=devdb \
 -e MONGO_DB_PASSWORD=dev@123 -e MONGO_DB_HOSTNAME=mongo mylandmarktech/spring-boot-mongo

docker run --name mongo -d --network tesla -e MONGO_INITDB_ROOT_PASSWORD=dev@123 \
 -e MONGO_INITDB_ROOT_USERNAME=devdb mongo

      MONGO_INITDB_ROOT_USERNAME: root
      MONGO_INITDB_ROOT_PASSWORD: example

mongo
PostgreSQL
mysql

docker run --name mongo -d --network tesla -e MONGO_INITDB_ROOT_PASSWORD=dev@123 \
 -e MONGO_INITDB_ROOT_USERNAME=devdb -v /home/ubuntu/db:/data/db mongo

$ docker run --name some-mongo -v /home/ubuntu/db:/data/db -d mongo
  docker run --name some-mongo -v /home/ubuntu/mydata:/data/db -d mongo
  docker run --name some-mongo -v /tmp/mydata:/data/db -d mongo

      -v = volume mapping
     -e = pass Environmental variables
     -d = run the container in detachable modev
     -p = portMapping/
     -it= run the container in interactive mode
     --name=assign a name to the container
     --network = define a network for the container

type=Internal Server Error, status=500


spring:
  data:
    mysql:
      host: ${MYSQL_DB_HOSTNAME}
      port: 27017
      username: ${MYSQL_DB_USERNAME}   ${DB-USERNAME}
    password: ${MYSQL_DB_PASSWORD}      ${DB-PWD}
      database: users
      authentication-database: admin
server:
  port: 8080


    environment:  ADMIN
      MYSQL_ROOT_PASSWORD: example



ubuntu@docker:~$ docker network --help

Usage:  docker network COMMAND

Manage networks

Commands:
  connect     Connect a container to a network
  create      Create a network
  disconnect  Disconnect a container from a network
  inspect     Display detailed information on one or more networks
  ls          List networks
  prune       Remove all unused networks
  rm          Remove one or more networks

Run 'docker network COMMAND --help' for more information on a command.
ubuntu@docker:~$

Usage:  docker network connect [OPTIONS] NETWORK CONTAINER

        docker network connect ebay mongo
        docker network disconnect tesla mongo

docker network create/inspect/ls/disconnect/connect/rm/prune:
============================================================

-# Remove unused networks
docker network prune

-# Remove Network
docker network rm <networkNameOrId>

Docker Host Network.:
If we create containers in host network. Container will not have IP Address.
 Container will be created in a system network.

But we can't create more than one container with same container port in host network.
We no need to do port publish to access  containers.
   landmark-web-app  = containerPort,  EXPOSE=8080
   java-web-app      = containerPort,  EXPOSE=8080
   maven-web-app     = containerPort,  EXPOSE=8080

   docker run --network bridge --name landmark -d -p 6000:8080
   docker run --network bridge --name javaapp -d -p  7000:8080
   docker run --network bridge --name mavenapp -d -p 5500:8080

   docker run --ebay host -d --name hello mylandmarktech/hello
   docker run --network host -d --name webserver nginx


   docker run --network ebay -d -p 90:80 --name hello2 mylandmarktech/hello
     netstat -tulpn

Docker none/null network
========================
If we create container in none/null network. Container will not have IP Address.
We can't access  containers in this network
docker run --network none
Internal or external

Isolation
  docker run --ebay host -d --name hello mylandmarktech/hello
  docker disconnect hello ebay
  docker connect hello none


docker run --name springapp -d -p 4000:8080 --network tesla -e MONGO_DB_USERNAME=devdb \
 -e MONGO_DB_PASSWORD=dev@123 -e MONGO_DB_HOSTNAME=mongo mylandmarktech/spring-boot-mongo

docker run --name mongo -d --network tesla -e MONGO_INITDB_ROOT_PASSWORD=dev@123 \
 -e MONGO_INITDB_ROOT_USERNAME=devdb mongo

 docker run --name springapp --network tesla  -d -p 4000:8080 -e MONGO_DB_USERNAME=nancy \
 -e MONGO_DB_PASSWORD=rich@2023 -e MONGO_DB_HOSTNAME=mydb mylandmarktech/spring-boot-mongo

docker run --name mydb -d --network tesla -e MONGO_INITDB_ROOT_PASSWORD=rich@2023 \
 -e MONGO_INITDB_ROOT_USERNAME=nancy mongo


Docker:
  We use Docker for containerization
  We use Kubernetes for container orchestration/MGT
We install the docker containerization software:
In Linux/Windows/MacOS
  docker client /cli      = docker
  docker daemon/service   =
  docker registry         = ship/share

Application architecture:
  Monolithic  '
  Micro-services'

Which kind of applications can be containerised??
  - All applications [java/python/nodeJS, etc.]

What is needed to containerise an application:
  docker installed
  Dockerfile -- Instructions on how to build an image
  Docker Image -- is a package with apps code + dependencies
  containers -- apps or running instance/process of a docker image
  networks--- communication[internal or external]


  10M-users ----> webapp

  docker run --network none  --name webapp mylandmarktech/hello
  docker run --network host  --name webapp mylandmarktech/hello

docker:
  image      = packaging
  containers = process of the image
  networks   = communication
  volumes    = storage/mounts for the containers

docker Volumes



docker run --name mongo -d --network tesla -v /tmp/mongo:/data/db -e MONGO_INITDB_ROOT_PASSWORD=dev@123 -e MONGO_INITDB_ROOT_USERNAME=devdb mongo


Bind Mounts:
Bind mounts may stored data anywhere on the host system.
They may even be important system files or directories.

docker run --name mongo -d --network tesla \
  -v /tmp/mongo:/data/db \
  -e MONGO_INITDB_ROOT_PASSWORD=dev@123 \
  -e MONGO_INITDB_ROOT_USERNAME=devdb mongo

Non-Docker processes on the Docker host or a
Docker container can modify them at any time.

Docker Volumes
Volumes stored data in a part of the host filesystem managed by docker

DHD = /var/lib/docker

BindMount:
  /tmp/mongo:/data/db
  /home/ubuntu/data:/data/db

Docker Peristent Volumes(Docker Named Volumes)
=============================================
docker volume create mongodata
docker volume create -d local data

docker run --name mongo -d --network tesla \
  -v data:/data/db \
  -e MONGO_INITDB_ROOT_PASSWORD=dev@123 \
  -e MONGO_INITDB_ROOT_USERNAME=devdb mongo

docker run --name mongo -d --network tesla \
  -v data30:/data/db \
  -e MONGO_INITDB_ROOT_PASSWORD=dev@123 \
  -e MONGO_INITDB_ROOT_USERNAME=devdb mongo



docker volume rm data

Volumes are the best way to persist data in Docker.:

External volumes:
 ===== Network Volumes Using AWS EBS ==========

 1) Create IAM User with EC2 Full Access and user access key & Secret Key of the same.
 Replace your access key & secret below.

  ebs -->

https://rexray.readthedocs.io/en/v0.8.2/user-guide/docker-plugins/
Rexray docker-plugins for storage:

docker plugin install rexray/ebs \
  EBS_ACCESSKEY=AKIAUGAKLPXT65ZKOPNJ \
  EBS_SECRETKEY=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

docker IAM Role   =

docker volume create -d rexray/ebs ebs30
docker volume create -d local ebs40

default volume driver  local
default network driver bridge

External volume

Deploy the mongoDB container using external volumes:

docker run --name mongo -d --network tesla \
  -v ebs30:/data/db \
  -e MONGO_INITDB_ROOT_PASSWORD=dev@123 \
  -e MONGO_INITDB_ROOT_USERNAME=devdb mongo




By default volumes are mounted as Read/Write

We can map Volumes As Read Only using below option
   -v <volumeName/BindMount>:<containerPath>:ro

Docker Compose
==============
Deploy a web applications with a mongo Database in docker:

dependency deployments:
  docker create volume
  docker create network

2. mongoDB deployment:
docker run --name mongo -d \
   --network tesla \
  -v ebs30:/data/db:rw \
  -e MONGO_INITDB_ROOT_PASSWORD=dev@123 \
  -e MONGO_INITDB_ROOT_USERNAME=devdb mongo

3.webapp deployment:
docker run --name springapp -d \
   --network tesla \
  -e MONGO_DB_PASSWORD=dev@123 \
  -e MONGO_DB_HOSTNAME=mongo \
  -e MONGO_DB_USERNAME=devdb mongo





docker run --name mongo -d \
   --network tesla \
  -v ebs30:/data/db \
  -v ebs50:/data/db \
  -e MONGO_INITDB_ROOT_PASSWORD=dev@123 \
  -e MONGO_INITDB_ROOT_USERNAME=devdb mongo




docker run --name springapp -d -p 4000:8080 --network tesla -e MONGO_DB_USERNAME=devdb \
 -e MONGO_DB_PASSWORD=dev@123 -e MONGO_DB_HOSTNAME=mongo mylandmarktech/spring-boot-mongo


Docker Compose
==============

Docker Compose is a tool for defining/declaring and running multiple
   containerised micro-services applications.
In real time one application can have more than 7 micro-services:
ebay.com:
An e-commerce java based web application for ebay or
ebay-web-application:
    Login
    Registration
    cart
    checkout
    Payment
    Order
    mysql db

docker run --name login -d -p 4000:8080 --network tesla -e MONGO_DB_USERNAME=devdb \
 -e MONGO_DB_PASSWORD=dev@123 -e MONGO_DB_HOSTNAME=mongo mylandmarktech/login

docker run --name registration -d -p  --network tesla -e MONGO_DB_USERNAME=devdb \
 -e MONGO_DB_PASSWORD=dev@123 -e MONGO_DB_HOSTNAME=mongo mylandmarktech/registration

docker run --name cart -d -p  --network tesla -e MONGO_DB_USERNAME=devdb \
 -e MONGO_DB_PASSWORD=dev@123 -e MONGO_DB_HOSTNAME=mongo mylandmarktech/cart

docker run --name checkout -d -p  --network tesla -e MONGO_DB_USERNAME=devdb \
 -e MONGO_DB_PASSWORD=dev@123 -e MONGO_DB_HOSTNAME=mongo mylandmarktech/checkout

docker run --name checkout -d -p  --network tesla -e MONGO_DB_USERNAME=devdb \
 -e MONGO_DB_PASSWORD=dev@123 -e MONGO_DB_HOSTNAME=mongo mylandmarktech/checkout


docker run --name springapp -d -p 4000:8080 --network tesla -e MONGO_DB_USERNAME=devdb \
 -e MONGO_DB_PASSWORD=dev@123 -e MONGO_DB_HOSTNAME=mongo mylandmarktech/spring-boot-mongo


  docker network create ecommerce

  docker volume create datas

docker-compose file default name = docker-compose.yml:
     - login, registration, cart, checkout, payment, order
docker --version
Docker version 20.10.12,    build 20.10.12-0ubuntu4
3.1                     1.13.1+
3.1                     20.10.12

version: '3.1'
volumes:
  data25:
    driver: local
  data28:
    driver: rexray/ebs
networks:
  ecommerce:
    driver: bridge
  amazon:
    driver: bridge
services:
  login
  registration
  cart
  checkout
  payment
  order



yaml/yml: kubernetes / ansible / docker-compose
key:value pairs
  name: simon
dictionary
  name: simon
  age: 25
  company: mylandmarktech
list/array:
students:
  - simon
  - james
  - paul
environment:
- hostname
- username
- password

docker run --name springapp -d -p 4000:8080 --network tesla -e MONGO_DB_USERNAME=devdb \
 -e MONGO_DB_PASSWORD=dev@123 -e MONGO_DB_HOSTNAME=mongo mylandmarktech/spring-boot-mongo


version: '3.1'
services:
  springapp:
    image: mylandmarktech/spring-boot-mongo
    restart: always
    ports:
      - 3000:8080
    networks:
      - amazon
    environment:
      - MONGO_DB_HOSTNAME=mongo
      - MONGO_DB_USERNAME=proddb
      - MONGO_DB_PASSWORD=prod@123
  mongo:
    image: mongo
    restart: always
    volumes:
      - data28:/data/db
    networks:
      - amazon
    environment:
      - MONGO_INITDB_ROOT_USERNAME=proddb
      - MONGO_INITDB_ROOT_PASSWORD=prod@123
volumes:
  data28:
    driver: local
networks:
  amazon:
    driver: bridge


sudo apt  install docker-compose
Commands
-# Syntax Check
docker-compose config

deploy with existing network/volumes:
======================
version: '3.1'
services:
  springapp:
    image: mylandmarktech/spring-boot-mongo
    restart: always
    ports:
      - 3000:8080
    networks:
      - ebay
    environment:
      - MONGO_DB_HOSTNAME=mongo
      - MONGO_DB_USERNAME=proddb
      - MONGO_DB_PASSWORD=prod@123
  mongo:
    image: mongo
    restart: always
    volumes:
      - ebs30:/data/db
    networks:
      - ebay
    environment:
      - MONGO_INITDB_ROOT_USERNAME=proddb
      - MONGO_INITDB_ROOT_PASSWORD=prod@123
volumes:
  ebs30:
    external: true
networks:
  ebay:
    external: true

             dev     uat      prod
USERNAME   devdb     uatdb    proddb
hostname   mongo     mymongo  mongodb
password   dev@123   uat@123  admib@#123

# Create Services/Contianers
docker-compose up -d

# Remove Services/Contianers
docker-compose down




If docker compose file with custom name.
docker-compose -f <CustomeComposeFileName>.yml <command>

Ex:
docker-compose -f docker-compose-springapp.yml config
docker-compose -f docker-compose-springapp.yml up -d

docker-compose -f docker-compose-springapp.yml down

docker-compose help

Docker Compose Commands:

  Ex:
docker-compose default file: docker-compose.yml
docker-compose -f docker-compose.yml up -d
docker-compose up -d
docker-compose config

docker-compose custom file: docker-compose-springapp.yml
docker-compose -f docker-compose-springapp.yml config
docker-compose -f docker-compose-springapp.yml up -d

docker-compose -f docker-compose-springapp.yml down


Commands:
  build              Build or rebuild services
  config             Validate and view the Compose file
  create             Create services
  down               Stop and remove resources
  events             Receive real time events from containers
  exec               Execute a command in a running container
  help               Get help on a command
  images             List images
  kill               Kill containers
  logs               View output from containers
  pause              Pause services
  port               Print the public port for a port binding
  ps                 List containers
  pull               Pull service images
  push               Push service images
  restart            Restart services
  rm                 Remove stopped containers
  run                Run a one-off command
  scale              Set number of containers for a service
  start              Start services
  stop               Stop services
  top                Display the running processes
  unpause            Unpause services
  up                 Create and start containers
  version            Show version information and quit


kubernetes =  12*4 = 12hours * 3 = 36 hours
kubernetes Engineer  = 200k

Overlay/multi-Host network

This the end of this code
