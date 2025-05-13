# Demonstratoin of `gradle :{project}:run`

Running `:app-two:run` does not run the other app (and vice verca)

```
$ ./gradlew :app-two:run --dry-run
Reusing configuration cache.
:list:compileJava SKIPPED
:utilities:compileJava SKIPPED
:app-two:compileJava SKIPPED
:app-two:processResources SKIPPED
:app-two:classes SKIPPED
:list:processResources SKIPPED
:list:classes SKIPPED
:list:jar SKIPPED
:utilities:processResources SKIPPED
:utilities:classes SKIPPED
:utilities:jar SKIPPED
:app-two:run SKIPPED
```
