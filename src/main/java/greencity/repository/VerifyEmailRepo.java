package greencity.repository;

import java.util.Optional;

import greencity.entity.VerifyEmail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for {@link VerifyEmail}
 *
 * @author Nazar Stasyuk
 * @version 1.0
 */
public interface VerifyEmailRepo extends JpaRepository<VerifyEmail, Long> {

    /**
     * Method that allow you find {@link VerifyEmail} by token
     *
     * @param token - {@link String}
     * @return {@link Optional<VerifyEmail>}
     */
    Optional<VerifyEmail> findByToken(String token);
}
