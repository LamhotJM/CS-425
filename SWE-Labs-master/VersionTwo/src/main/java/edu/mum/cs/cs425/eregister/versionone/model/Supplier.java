package edu.mum.cs.cs425.eregister.versionone.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
public class Supplier {
    @Id
    @GeneratedValue
    private int supplierId;

    @NotBlank(message = "please provide number")
    private int supplierNumber;

    @NotBlank(message = "please provide name")
    private String name;

    private String contactPhoneNumber;

    @OneToMany(mappedBy = "supplier") // a Supplier supplies zero or many Products
    List<Product> products;

    public Supplier() {
    }

    public Supplier(@NotBlank(message = "please provide number") int supplierNumber,
                    @NotBlank(message = "please provide name") String name, String contactPhoneNumber,
                    List<Product> products) {
        this.supplierNumber = supplierNumber;
        this.name = name;
        this.contactPhoneNumber = contactPhoneNumber;
        this.products = products;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public int getSupplierNumber() {
        return supplierNumber;
    }

    public void setSupplierNumber(int supplierNumber) {
        this.supplierNumber = supplierNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId=" + supplierId +
                ", supplierNumber=" + supplierNumber +
                ", name='" + name + '\'' +
                ", contactPhoneNumber='" + contactPhoneNumber + '\'' +
                ", products=" + products +
                '}';
    }
}
