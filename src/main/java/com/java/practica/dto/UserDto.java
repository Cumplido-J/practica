package com.java.practica.dto;

import com.java.practica.entity.User;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long idUser;
    private String nombre;
    private String apellido;
    private String tipoUsuario;

    public User add ( UserDto userDto){
        User user= new User();
        user.setNombre(userDto.getNombre());
        user.setApellido(userDto.getApellido());
        user.setTipoUsuario(userDto.getTipoUsuario());
        return user;
    }


}
