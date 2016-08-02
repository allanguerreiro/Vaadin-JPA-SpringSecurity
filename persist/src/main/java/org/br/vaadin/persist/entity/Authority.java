package org.br.vaadin.persist.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by allan on 22/07/16.
 */
@Entity
@Table(name = "USER_AUTH")
public class Authority implements Serializable {

    @Id
    @Column(name = "username")
    @Getter @Setter
    private String username;

    @Column(name = "authority")
    @Getter @Setter
    private String authority;

    @ManyToOne(targetEntity = User.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "username", referencedColumnName = "username", insertable = false, updatable = false)
    @Getter @Setter
    private User user;
}
