package models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Dictionary")
public class Dictionary implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Name")
    private String name;

    public Dictionary(){}
    public Dictionary(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Dictionary{" +
                "name='" + name + '\'' +
                '}';
    }
}
