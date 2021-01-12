# Herobook API

### GC publishing is developing a new API for fans to browse all the heroes and villains from the comics

##API Specification
### Resource Summary

| URI  | HTTP METHOD | HTTP STATUS | Description |
| ------------- | ------------- | ------------ |------------ |
| /gcp/api/heros  | GET  | 200 | API to get all the hero's names for the visitor |
| /gcp/api/heros/{name}  | GET  |200 |Return the details of the hero by the input name otherwise throw exception with message "Hero doesn't exist" |

### API --> /gcp/api/heros
#### Response
[
{
"heroName":"Batman"
},
{
"heroName":"SpiderMan"
},
{
"heroName":"SuperMan"
}
]

image, real name, hero name, height, weight, special power, intelligence, strength, power, speed, agility, description, and story.

### API --> /gcp/api/heros/{name}
####Response - If the hero is found by the name
{
"image":"/src/batman.jpg",  
"realName":"Bruce Wayne",   
"heroName":"Batman",    
"height":"6 feet",  
"weight":"180 lbs", 
"specialPower":"None",  
"intelligence":"100",   
"strength":"90",
"power":"None",
"speed":"Normal",
"agility":"60",
"description":"Fighting crime at night wearing bat suit"
"story":"Turned into batman to make the gotham city safer"
}

-- Throw HeroNotFoundException with message "Hero doesn't exist"

1. Controller Test - HeroPersonaController
2. Service - HeroPersonaService
3. Repository - HeroPersonaRepository
