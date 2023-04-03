package google.drive.domain;

import google.drive.DriveApplication;
import google.drive.domain.FileUploaded;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Upload_table")
@Data
public class Upload {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        FileUploaded fileUploaded = new FileUploaded(this);
        fileUploaded.publishAfterCommit();
    }

    public static UploadRepository repository() {
        UploadRepository uploadRepository = DriveApplication.applicationContext.getBean(
            UploadRepository.class
        );
        return uploadRepository;
    }
}
