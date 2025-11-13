package creational.builder;

public class BuilderDesignPattern {
    private int id;
    private String stringField;
    private double doubleField;

    public int getId() {
        return id;
    }

    public String getStringField() {
        return stringField;
    }

    public double getDoubleField() {
        return doubleField;
    }

    public BuilderDesignPattern(Builder builder){
     this.id = builder.id;
     this.stringField = builder.stringField;
     this.doubleField = builder.doubleField;
    }


    public static class Builder{
        private int id = 0;
        private String stringField = null;
        private double doubleField = 0d;


        public Builder id(int id){
            this.id = id;
            return this;
        }

        public Builder stringField(String stringField){
            this.stringField = stringField;
            return this;
        }

        public Builder doubleField(double doubleField){
            this.doubleField = doubleField;
            return this;
        }

        public BuilderDesignPattern build(){
            return new BuilderDesignPattern(this);
        }

    }


    @Override
    public String toString() {
        return "Builder{" +
                "id=" + id +
                ", stringField='" + stringField + '\'' +
                ", doubleField=" + doubleField +
                '}';}
}


class ForExample{
    public static void main(String[] args) {
        BuilderDesignPattern builder = new BuilderDesignPattern.Builder()
                .stringField("builder design pattern")
                .doubleField(4.6)
                .id(1)
                .build();

        System.out.println(builder.getId()
        + "  ----   " + builder.getStringField()
        + "   ----   " + builder.getDoubleField());
    }
}

