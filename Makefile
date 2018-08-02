#Makefile
ALLSOURCE = ./src/*.java
JAVAC = /home/Kaito/.sdkman/candidates/java/current/bin/javac

.PHONY: all
all: comp
comp:
	${JAVAC} -encoding utf-8 -d ./bin ${ALLSOURCE}

.PHONY: clean
clean:
	rm -rf ./bin/*.class