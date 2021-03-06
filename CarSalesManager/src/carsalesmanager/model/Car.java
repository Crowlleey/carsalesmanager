package carsalesmanager.model;
// Generated Nov 26, 2017 6:00:21 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Car generated by hbm2java
 */
@Entity
@Table(name="car"
    ,catalog="carSalesManager"
)
public class Car  implements java.io.Serializable {


     private Integer idCar;
     private CarType carType;
     private Color color;
     private Model model;
     private Sale sale;
     private String plate;
     private Integer age;
     private String description;
     private Boolean statusCar;
     private Integer km;
     private Double price;
     private Boolean saleState;
     private Set<Accessory> accessories = new HashSet<Accessory>(0);

    public Car() {
    }
    
     public Car(CarType carType, Color color, Model model, String plate, Integer age, String description, Boolean statusCar, Integer km, Double price, Boolean saleState) {
       this.carType = carType;
       this.color = color;
       this.model = model;
       this.plate = plate;
       this.age = age;
       this.description = description;
       this.statusCar = statusCar;
       this.km = km;
       this.price = price;
       this.saleState = saleState;
    }
    
    
     public Car(CarType carType, Color color, Model model, String plate, Integer age, String description, Boolean statusCar, Integer km, Double price, Boolean saleState, Set<Accessory> accessories) {
       this.carType = carType;
       this.color = color;
       this.model = model;
       this.plate = plate;
       this.age = age;
       this.description = description;
       this.statusCar = statusCar;
       this.km = km;
       this.price = price;
       this.saleState = saleState;
       this.accessories = accessories;
    }
     
    public Car(CarType carType, Color color, Model model, Sale sale, String plate, Integer age, String description, Boolean statusCar, Integer km, Double price, Boolean saleState, Set<Accessory> accessories) {
       this.carType = carType;
       this.color = color;
       this.model = model;
       this.sale = sale;
       this.plate = plate;
       this.age = age;
       this.description = description;
       this.statusCar = statusCar;
       this.km = km;
       this.price = price;
       this.saleState = saleState;
       this.accessories = accessories;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_car", unique=true, nullable=false)
    public Integer getIdCar() {
        return this.idCar;
    }
    
    public void setIdCar(Integer idCar) {
        this.idCar = idCar;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="id_car_type")
    public CarType getCarType() {
        return this.carType;
    }
    
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="id_color")
    public Color getColor() {
        return this.color;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="id_model")
    public Model getModel() {
        return this.model;
    }
    
    public void setModel(Model model) {
        this.model = model;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="id_sale")
    public Sale getSale() {
        return this.sale;
    }
    
    public void setSale(Sale sale) {
        this.sale = sale;
    }

    
    @Column(name="plate", length=8)
    public String getPlate() {
        return this.plate;
    }
    
    public void setPlate(String plate) {
        this.plate = plate;
    }

    
    @Column(name="age")
    public Integer getAge() {
        return this.age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }

    
    @Column(name="description", length=500)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="status_car")
    public Boolean getStatusCar() {
        return this.statusCar;
    }
    
    public void setStatusCar(Boolean statusCar) {
        this.statusCar = statusCar;
    }

    
    @Column(name="km")
    public Integer getKm() {
        return this.km;
    }
    
    public void setKm(Integer km) {
        this.km = km;
    }

    
    @Column(name="price", precision=22, scale=0)
    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }

    
    @Column(name="sale_state")
    public Boolean getSaleState() {
        return this.saleState;
    }
    
    public void setSaleState(Boolean saleState) {
        this.saleState = saleState;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="car_accessory", catalog="carSalesManager", joinColumns = { 
        @JoinColumn(name="id_car", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="id_accessory", nullable=false, updatable=false) })
    public Set<Accessory> getAccessories() {
        return this.accessories;
    }
    
    public void setAccessories(Set<Accessory> accessories) {
        this.accessories = accessories;
    }




}


