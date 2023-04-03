package google.drive.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Notified_table")
@Data
public class Notified {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
