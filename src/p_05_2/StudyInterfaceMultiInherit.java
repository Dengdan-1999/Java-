package p_05_2;

public class StudyInterfaceMultiInherit {
    public void testc(){}
    public void testa(){}
    public void testb(){}
}

interface A02{
    void testa();
}

interface B{
    void testb();
}

interface C extends A,B{
    void testc();
}
