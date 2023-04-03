package google.drive.infra;

import google.drive.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class UploadHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Upload>> {

    @Override
    public EntityModel<Upload> process(EntityModel<Upload> model) {
        return model;
    }
}
