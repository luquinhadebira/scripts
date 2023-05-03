from urllib.request import urlopen
from bs4 import BeautifulSoup

url = input("Qual página você gostaria de buscar?")
keyword = input("Qual a palavra chave desejada?")

try:
    html = urlopen(url)
except HTTPEError as e:
    print(e)
data = BeautifulSoup(html, "html.parser")

def buscar_no_titulo(keyword,data):
    if keyword.casefold() in data.title.text.casefold():
        status="Encontrado"
    else:
        status="Não encontrado"
    return status
print(buscar_no_titulo(keyword,data))