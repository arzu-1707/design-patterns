public class BuilderDesignPattern {
    private int id;
    private String stringField;
    private double doubleField;


    public BuilderDesignPattern(Builder builder){
     this.id = builder.id;
     this.stringField = builder.stringField;
     this.doubleField = builder.doubleField;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStringField() {
        return stringField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }

    public double getDoubleField() {
        return doubleField;
    }

    public void setDoubleField(double doubleField) {
        this.doubleField = doubleField;
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


