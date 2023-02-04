class Isogram
  def self.isogram?(input)
    letters_array = input.split("")
    letters_array.uniq == letters_array
  end
end