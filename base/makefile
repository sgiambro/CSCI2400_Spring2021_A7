ALL.class: ALL.java ATM.class USER.class ADMIN.class
	javac -g ALL.java

ADMIN.class: ADMIN.java USER.class ATM.class
	javac -g ADMIN.java

USER.class: USER.java ATM.class
	javac -g USER.java

ATM.class: ATM.java
	javac -g ATM.java

run: ALL.class
	java ALL
