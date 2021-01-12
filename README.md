# Herobook API

### GC publishing is developing a new API for fans to browse all the heroes and villains from the comics

##API Specification
### Resource Summary

| URI  | HTTP METHOD | HTTP STATUS | Description |
| ------------- | ------------- | ------------ |------------ |
| /gcp/api/heros  | GET  | 200 | API to get all the hero's names for the visitor |
| /gcp/api/heros/{name}  | GET  |200 |Return the details of the hero by the input name otherwise throw exception with message "Hero doesn't exist" |
