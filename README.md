# user-search-api

Steps to run the project : 

step1: download/clone the project in your locale and build the project using below command in root folder (/UserDetails)
mvn clean install

step2 : run the jar file in the target folder
java -jar UserDetatils-0.0.1-SNAPSHOT.jar


Run the below urls for requird result

Search users with in range :

http://localhost:8081/users/0/100

http://localhost:8081/users/1/100

http://localhost:8081/users/2/100

<img width="380" alt="image" src="https://user-images.githubusercontent.com/34954645/180916968-86bbcbe6-8915-4b56-aea6-d3da8d92fed5.png">
<img width="338" alt="image" src="https://user-images.githubusercontent.com/34954645/180917008-33c7d74b-6e1c-4823-a693-3e5725b24cc6.png">



Sort Users with in the range : 

http://localhost:8081/users/sort/0/100?sort=age,desc

http://localhost:8081/users/sort/0/100?sort=age,asc

http://localhost:8081/users/sort/0/100?sort=name,desc

http://localhost:8081/users/sort/0/100?sort=name,asc

<img width="422" alt="image" src="https://user-images.githubusercontent.com/34954645/180917042-2acda22d-917c-49b0-bee4-fd977324ce77.png">
<img width="494" alt="image" src="https://user-images.githubusercontent.com/34954645/180917076-596a5f72-b39d-4e04-8f0d-20091a3bec8e.png">



Filter Users with Given value : 

http://localhost:8081/users/filter/age?age=50

http://localhost:8081/users/filter/name?name=drbomqoisx

<img width="457" alt="image" src="https://user-images.githubusercontent.com/34954645/180917099-b516fee8-1b60-4cca-bb34-d2e74711abc7.png">
<img width="487" alt="image" src="https://user-images.githubusercontent.com/34954645/180917136-35f3e127-ddc9-41db-802b-f040ce28bd3e.png">

