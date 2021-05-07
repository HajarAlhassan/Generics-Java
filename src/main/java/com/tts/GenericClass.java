package com.tts;

public class GenericClass<T>{
    private T genericAttribute;
    private String name;

    public T getGenericAttribute() {
        return genericAttribute;
    }

    public void setGenericAttribute(T genericAttribute) {
        this.genericAttribute = genericAttribute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GenericClass(T genericAttribute, String name) {
        this.genericAttribute = genericAttribute;
        this.name = name;

    }
    public void printAttribute(){
        System.out.println("The generic Attribute is: "+this.genericAttribute+", and it's type is "+this.genericAttribute.getClass());
    }

    public static void main(String[] args) {
        GenericClass<Integer> integerClass=new GenericClass<>(4,"Hajar");
        integerClass.printAttribute();
        GenericClass<String> stringClass=new GenericClass<>("My name is ","Hajar");
        stringClass.printAttribute();

    }
}
