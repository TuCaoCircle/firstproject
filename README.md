# firstproject
everything is in there
about appliction.yml as same as application.properties
@ConfigurationProperties make class as config. 
you could to see the firstproject,as a demo.

@ConfigurationProperties(prefix = "person") 
the prefix is mapped to .yml(.properties)

if you used the @Autowired with some bean,you must make beans as components(@Component).
about the syntax of .Yml , it controls hierarchical relationships by indentation of spaces.

#for example  
person:    
&nbsp;&nbsp;name: chenjiawei  
&nbsp;&nbsp;age: 12  
&nbsp;&nbsp;dog:   
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;name: ergouzi  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;age: 3  
&nbsp;&nbsp;list:  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- 1   
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- 2   
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- 3   
&nbsp;&nbsp;map: {k: v,son: lisi}  
