package carsalesmanager.model;
// Generated Nov 26, 2017 6:00:21 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Payment generated by hbm2java
 */
@Entity
@Table(name="payment"
    ,catalog="carSalesManager"
)
public class Payment  implements java.io.Serializable {


     private Integer idPayment;
     private Sale sale;
     private Integer paymentNumber;
     private Double paymentAmount;
     private Boolean paid;

    public Payment() {
    }

    public Payment(Sale sale, Integer paymentNumber, Double paymentAmount, Boolean paid) {
       this.sale = sale;
       this.paymentNumber = paymentNumber;
       this.paymentAmount = paymentAmount;
       this.paid = paid;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_payment", unique=true, nullable=false)
    public Integer getIdPayment() {
        return this.idPayment;
    }
    
    public void setIdPayment(Integer idPayment) {
        this.idPayment = idPayment;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_sale")
    public Sale getSale() {
        return this.sale;
    }
    
    public void setSale(Sale sale) {
        this.sale = sale;
    }

    
    @Column(name="payment_number")
    public Integer getPaymentNumber() {
        return this.paymentNumber;
    }
    
    public void setPaymentNumber(Integer paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    
    @Column(name="payment_amount", precision=22, scale=0)
    public Double getPaymentAmount() {
        return this.paymentAmount;
    }
    
    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    
    @Column(name="paid")
    public Boolean getPaid() {
        return this.paid;
    }
    
    public void setPaid(Boolean paid) {
        this.paid = paid;
    }




}

