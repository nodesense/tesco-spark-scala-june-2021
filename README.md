---
title: "Spark Setup on Mac"
date: "2020-10-10"
excerpt: "Big Data Introduction"
---

## Spark Setup


Python 3.7 is needed



Download spark
 

```
wget https://downloads.apache.org/spark/spark-2.4.7/spark-2.4.7-bin-hadoop2.7.tgz

```

unzip and move to /opt folder

open terminal 

```
cd ~/Downloads

tar xf spark-2.4.7-bin-hadoop2.7.tgz
```

```
sudo mv spark-2.4.7-bin-hadoop2.7 /opt
sudo chmod 777 /opt/spark-2.4.7-bin-hadoop2.7
```

Set the environment Variable

```
touch ~/.bash_profile

nano ~/.bash_profile
```



Paste below
```
export SPARK_HOME=/opt/spark-2.4.7-bin-hadoop2.7

export JAVA_HOME=$(/usr/libexec/java_home)
```

to save the content, 

Press Ctrl + O

Then press Enter key if it is asking to write the file...

To exit the nano editor,

Press Ctrl + X

to start spark-shell, in new mac terminal

```
$SPARK_HOME/bin/spark-shell


```