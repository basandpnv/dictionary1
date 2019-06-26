package models;
import javax.persistence.*;

@Entity
@Table(name = "Word")

public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "Value")
    private String value;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_key")
    private Key key;
    public Word(){}

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Long getId() {
        return id;
    }

    public Word(String value) {
        this.value = value;
    }
}
