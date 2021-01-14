# Herobook API

### GC publishing is developing a new API for fans to browse all the heroes and villains from the comics

##API Specification
### Resource Summary

| URI  | HTTP METHOD | HTTP STATUS | Description |
| ------------- | ------------- | ------------ |------------ |
| /gcp/api/heros  | GET  | 200 | API to get all the hero's names for the visitor |
| /gcp/api/heros/{name}  | GET  |200 |Return the details of the hero by the input name |
| /gcp/api/heros/{name}  | GET  |404 |Return  message "Hero doesn't exist" when no hero found with the given input|
| /gcp/api/villains  | GET  | 200 | API to get all the villain's names for the visitor |
| /gcp/api/villains/{name}  | GET  |200 |Return the details of the villain by the input name |
| /gcp/api/villains/{name}  | GET  |404 |Return  message "Villain doesn't exist" when no villain found with the given input|

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

####Response - If the hero is not found by the name
return HTTP status not found with message "Hero doesn't exist."

### API --> /gcp/api/villains
#### Response
[
{
"villainName":"Joker"
},
{
"villainName":"Dr.Octopus"
},
{
"villainName":"Lex Luther"
}
]Villains have an arch rival, image, real name, hero name, height, weight, special power, intelligence, strength, power, speed, agility, description, and story.

### API --> /gcp/api/villains/{name}
####Response - If the villain is found by the name
{
"archRival":"Batman"
"image":"/src/joker.jpg",  
"realName":"Jack Napier",   
"heroName":"Batman",    
"height":"6 feet",  
"weight":"180 lbs",
"specialPower":"None",  
"intelligence":"200",   
"strength":"60",
"power":"None",
"speed":"Fast",
"agility":"70",
"description":"Fighting Batman"
"story":"Fight Batman with all his evil ideas"
}

####Response - If the villain is not found by the name
return HTTP status not found with message "Villain doesn't exist."



