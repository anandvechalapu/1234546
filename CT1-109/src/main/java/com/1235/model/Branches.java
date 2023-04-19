@Entity
@Table(name = "branches")
public class Branches {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number")
    private String number;

    @Column(name = "wholesaler")
    private String wholesaler;

    @Column(name = "sub_functionalities")
    private List<String> subFunctionalities;

    @Column(name = "has_permission")
    private Boolean hasPermission;

    public Branches() {}

    public Branches(String number, String wholesaler, List<String> subFunctionalities, Boolean hasPermission) {
        this.number = number;
        this.wholesaler = wholesaler;
        this.subFunctionalities = subFunctionalities;
        this.hasPermission = hasPermission;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getWholesaler() {
        return wholesaler;
    }

    public void setWholesaler(String wholesaler) {
        this.wholesaler = wholesaler;
    }

    public List<String> getSubFunctionalities() {
        return subFunctionalities;
    }

    public void setSubFunctionalities(List<String> subFunctionalities) {
        this.subFunctionalities = subFunctionalities;
    }

    public Boolean getHasPermission() {
        return hasPermission;
    }

    public void setHasPermission(Boolean hasPermission) {
        this.hasPermission = hasPermission;
    }

}