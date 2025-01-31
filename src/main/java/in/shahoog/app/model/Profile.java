package in.shahoog.app.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long profileId;

    private String profileName;

    @Enumerated(EnumType.STRING) // Store the enum as a string in the database
    private ProfileType profileType;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
}
