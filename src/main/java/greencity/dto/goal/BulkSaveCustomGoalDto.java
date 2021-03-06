package greencity.dto.goal;

import java.util.List;
import javax.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BulkSaveCustomGoalDto {
    @Valid List<@Valid CustomGoalSaveRequestDto> customGoalSaveRequestDtoList;
}
