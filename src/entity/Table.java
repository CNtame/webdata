package entity;

public class Table
{
    private String name;
    private String sex;
    private int age;
    private int score;


    public void setName(String a)
    {
        name=a;
    }
    public String getName()
    {
        return name;
    }

    public void setSex(String a)
    {
        sex=a;
    }
    public String getSex()
    {
        return sex;
    }

    public void setAge(int a)
    {
        age=a;
    }
    public int getAge()
    {
        return age;
    }

    public void setScore(int a)
    {
        score=a;
    }
    public int getScore()
    {
        return score;
    }
    public Table(String a,String b,int c,int d)
    {
        name=a;
        sex=b;
        age=c;
        score=d;
    }






}
