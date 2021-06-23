const X_CLASS = 'x'
const O_CLASS = 'o'
const WINNING_COMBINATIONS = [
    [0, 1, 2],
    [3, 4, 5],
    [6, 7, 8],
    [0, 3, 6],
    [1, 4, 7],
    [2, 5, 8],
    [0, 4, 8],
    [2, 4, 6]
  ]
const CellElem = document.querySelectorAll('[data-cell');
const board=document.getElementById('board')
const winningMessageElement = document.getElementById('winMessage')
const winningMessageTextElement = document.querySelector('[data-win-message-text]')
const retryButton = document.getElementById('retryButton')

let turn;

startTic()

retryButton.addEventListener('click', startTic)

function startTic(){
    turn=1;
    for(let cell=0;cell<CellElem.length;cell++)
    {
        CellElem[cell].classList.remove(X_CLASS)
        CellElem[cell].classList.remove(O_CLASS)
        CellElem[cell].removeEventListener('click', whenClick)
        CellElem[cell].addEventListener('click',whenClick, { once:true})
    }
    setBoardHover();
    winningMessageElement.classList.remove('turn_on');

}

function whenClick(evt)
{
    const cell= evt.target;
    const currentClass=(turn==1)?X_CLASS:O_CLASS;
    placeMark(cell, currentClass)
    if(isWin(currentClass))
    {
        Gameover(false);
    }
    else if(isDraw())
    {
        Gameover(true);
    }
    else
    {
        turn = 3-turn; //swap turn
    setBoardHover()
    }
    

}

function Gameover(draw)
{
    if(draw)
    {
        winningMessageTextElement.innerText = "Draw!"
    }
    else{
        winningMessageTextElement.innerText = `${(turn==1) ? "X is the" : "O is the"} Winner!`
    }
    winningMessageElement.classList.add('turn_on')
}

function placeMark(cell, currentClass)
{
    cell.classList.add(currentClass);
}

function setBoardHover()
{
    board.classList.remove(X_CLASS)
    board.classList.remove(O_CLASS)
    if(turn==2)
    {
        board.classList.add(O_CLASS);
    }
    else
    {
        board.classList.add(X_CLASS)
    }
}

function isWin(currentClass) {
    return WINNING_COMBINATIONS.some(combination => {
      return combination.every(index => {
        return CellElem[index].classList.contains(currentClass)
      })
    })
  }

  function isDraw() {
    return [...CellElem].every(cell => {
      return cell.classList.contains(X_CLASS) || cell.classList.contains(O_CLASS)
    })
  }