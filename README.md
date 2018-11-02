example pdal with scala
===

https://github.com/PDAL/java


#### pdal 1.8

`Exception in thread "main" java.lang.UnsatisfiedLinkError: /tmp/jni-6240164113788477082/libpdaljni.1.4.so: libpdal_base.so.6: cannot open shared object file: No such file or directory`

```
sudo ln -s libpdal_base.so.8.0.0 libpdal_base.so.6
sudo ln -s libpdal_util.so.8.0.0 libpdal_util.so.6
```

#### greyhound

using the s2i build for local servings

use the `hack/start-greyhound.sh` script to stand up server with sample data

read from greyhound 
`pdal info --driver readers.greyhound -i http://localhost:8080/resource/red-rocks`

-https://greyhound.io/
-https://pdal.io/stages/readers.greyhound.html?highlight=greyhound
