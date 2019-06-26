package models;
import javax.persistence.*;

@Entity
@Table(name = "Key")
public class Key {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "Value")
    private String value;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_dict")
    private Dictionary dictionary;
    public Key(){}
    public Key(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Dictionary getDictionary() {
        return dictionary;
    }

    public void setDictionary(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public Long getId() {
        return id;
    }
}
