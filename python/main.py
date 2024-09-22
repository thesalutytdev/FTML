import ftml

def main():
    parse_res = ftml.FTMLParser.parse_file("/home/maxim/Загрузки/FTMLPython/example.ftml")

    for obj in parse_res:
        print(str(obj))
        
if __name__ == "__main__":
    main()