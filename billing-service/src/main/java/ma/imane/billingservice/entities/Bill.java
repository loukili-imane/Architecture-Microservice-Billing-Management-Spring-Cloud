package ma.imane.billingservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.imane.billingservice.model.Customer;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Bill {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private  Long id;
        private Date billingDate;
        @OneToMany(mappedBy = "bill")
        private Collection<ProductItem> productItems;
        private long customerID;
        @Transient
        private Customer customer;
    }
