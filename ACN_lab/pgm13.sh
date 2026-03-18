INPUT_FILE="grades.txt"

if [[ ! -f "$INPUT_FILE" ]]; then
  echo "Input file not found!"
  exit 1
fi

declare -A grades

while IFS=',' read -r name grade; do
  case "$grade" in
    A) percent="90%" ;;
    B) percent="80%" ;;
    C) percent="70%" ;;
    D) percent="60%" ;;
    F) percent="50%" ;;
    *) percent="N/A" ;;
  esac

  grades["$name"]=$percent
done < "$INPUT_FILE"

for name in "${!grades[@]}"; do
  echo "$name: ${grades[$name]}"
done
