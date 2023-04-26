#!/usr/bin/env python3

import pwd

# Lista todos os usuarios do sistema

for user in pwd.getpwall():
    print(user.pw_name)