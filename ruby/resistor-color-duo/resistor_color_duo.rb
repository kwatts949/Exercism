class ResistorColorDuo

  def self.value(str)
    colours = ["black","brown","red","orange","yellow","green","blue","violet","grey","white"]
  
    number = []
    number.push(colours.find_index(str[0]))
    number.push(colours.find_index(str[1]))
    number.join().to_i
  end
end