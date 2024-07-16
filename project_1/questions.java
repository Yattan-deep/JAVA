package  project_1;

class questions
{
    private int id;
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private int answer;

    public void setter( int id , String question ,  String option1 , String option2 , String option3 ,
        String option4 , int answer )
    {
        this.id = id;
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
    }



    public int getAnswer()
    {
        return this.answer;
    }

    public boolean check( int option )
    {
        if( option == this.answer ) return true;
        return false;
    }

    public void show()
    {
        System.out.println("Question : " + this.question);
        System.out.println("Option1 : " + this.option1);
        System.out.println("Option2 : " + this.option2);
        System.out.println("Option3 : " + this.option3);
        System.out.println("Option4 : " + this.option4);

    }
    
}