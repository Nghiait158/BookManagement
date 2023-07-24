public class Author {
    private String nameauthor;
    private Day birthauthor;
    // constructor----------
    public Author(){
    }
    public Author(String nameauthor, Day birthauthor){
        this.nameauthor=nameauthor;
        this.birthauthor=birthauthor;
    }
    // end of constructor. 
    // Start getter and setter.-------------
    public void setNameauthor(String nameauthor){
        this.nameauthor=nameauthor;
    }
    public String getNameauthor(){
        return nameauthor;
    }
    
    public void setBirthauthor(Day birthauthor){
        this.birthauthor=birthauthor;
    }
    public Day getBirthauthor(){
        return birthauthor;
    }
    //  end of setter and getter -------------

    public String toString(){
        return "Name: "+nameauthor+" BirthDay: "+birthauthor;
    }
}
