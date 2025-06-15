package SerializeandDeserialize;

import java.io.Serializable;

public class Example implements Serializable {
    int number;
    String name;

    public Example(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
