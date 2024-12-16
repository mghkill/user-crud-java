package com.example.user.controller;

import com.example.user.model.User;
import com.example.user.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @RestController marca esta classe como um controlador REST
// Isso significa que ela vai receber requisições HTTP
@RestController
// @RequestMapping define o caminho base para todas as URLs desta classe
@RequestMapping("/api/users")
public class UserController {
    // Injeção de dependência do serviço
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // GET /api/users - Lista todos os usuários
    @GetMapping
    public List<User> listarUsuarios() {
        return userService.getAllUsers();
    }

    // GET /api/users/1 - Busca um usuário específico
    @GetMapping("/{id}")
    public User buscarUsuario(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    // POST /api/users - Cria um novo usuário
    @PostMapping
    public User criarUsuario(@RequestBody NovoUsuarioRequest request) {
        return userService.createUser(request.getNome(), request.getIdade());
    }

    // PUT /api/users/1 - Atualiza um usuário existente
    @PutMapping("/{id}")
    public User atualizarUsuario(
            @PathVariable Long id,
            @RequestBody NovoUsuarioRequest request) {
        return userService.updateUser(id, request.getNome(), request.getIdade());
    }

    // DELETE /api/users/1 - Remove um usuário
    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}