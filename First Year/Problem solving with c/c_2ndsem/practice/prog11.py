file_name = r"D:\jeet.txt"
try:
    with open(file_name,'r') as file:
        content=file.read()
    print(content)
except Exception :
    print(f"file does'nt exist")