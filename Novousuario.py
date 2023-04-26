#!/usr/bin/env python3

import subprocess

#define o nome do usuario e senha

new_user_name = "Lucas"
new_user_pass = "pass123"

#Cria o usuário no sistema linux

subprocess.run(["sudo","useradd",new_user_name])
subprocess.run(["sudo","passwd",new_user_name], input=f"(new_user_pass\n{new_user_pass}\n".encode())

# input=f"(new_user_name\n{new_user_pass}\n".encode()

