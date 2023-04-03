package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ViedoStreamed extends AbstractEvent {

    private Long id;

    public ViedoStreamed(Video aggregate) {
        super(aggregate);
    }

    public ViedoStreamed() {
        super();
    }
}
